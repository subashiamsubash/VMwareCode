package com.vm.vmcode.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.vm.vmcode.model.AppendableObjectOutputStream;
import com.vm.vmcode.model.NumberModel;

@Service
public class NumberServices {
	private final UUID id = UUID.randomUUID();
	String path = "tmp/";
	ObjectOutputStream objectOut;
	ObjectInputStream ois;

	public UUID writeObject(NumberModel nm) {

		try {
			File file = new File(path + id + "_output.txt");
			boolean append = file.exists();
			FileOutputStream fos = new FileOutputStream(file, append);
			AppendableObjectOutputStream oout = new AppendableObjectOutputStream(fos, append);
			oout.writeObject(nm);
			oout.close();

		} catch (Exception ex) {

		}
		return id;
	}

	public boolean getStatus(UUID ids) {
		boolean flag = false;
		try {
			File folder = new File(path);
			File[] listOfFiles = folder.listFiles();

			if (listOfFiles.length >= 1) {
				for (File file : listOfFiles) {
					// System.out.println(file.getName());
					if (file.getName().equals(ids + "_output.txt")) {
						flag = true;
					}
				}
			} else {
				flag = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public ArrayList<Integer> get_number(UUID ids) {
		ArrayList<Integer> al = new ArrayList<>();
		boolean flag = true;
		try {

			ois = new ObjectInputStream(new FileInputStream(path + ids + "_output.txt"));
			while (flag) {
				NumberModel obj = (NumberModel) ois.readObject();
				if (obj != null) {
					al.add(obj.getGoal());
				} else {
					flag = false;
				}

			}

			System.out.println(al);
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return al;
	}

}
