# Question 1
## Run The NUMBER GENERATOR

###### step-1:Clone the code 
###### step-2: cd vmcode
###### step-2:run "docker build -t myorg/myapp ." 
###### step-3:run " docker run -p 8181:8181 myorg/myapp"

### Use Postman tool for below request  
###### step-4: POST:

           url:http://localhost:8181/api/generate
           body:{
                 "goal":"10",
                 "step":"2"
               }
##### step-5: GET:

           url:http://localhost:8181/api/tasks/{uuid}/status
           
###### step-6: GET:

          http://localhost:8181/api/tasks/{uuid}/getlist



# Question 3
## Login Application

###### step-1:Clone the code 
###### step-2: cd vmloginapp
###### step-3: npm install
###### step-4: npm start
###### step-5: Enter the url in browser
               http://localhost:8080/login
               
###### step-5 Register a User 

###### step-6 Loging using that user 


# Question 2
### 2.1Explain the concepts of Default Gateway in IP
A default gateway serves as an access point or IP router that a networked computer uses to send information to a computer in another network or the internet and it is used as a default gateway.


### 2.2Explain the concepts of SNAT and DNAT
SANT(Source Network Address Translation):It is used when an internal/private host needs to initiate a connection to an external/public host.it is change the private IP address of the source host to public IP address

DNAT(Destination Network Address Translation):Destination NAT changes the destination address in IP header of a packet. It may also change the destination port in the TCP/UDP headers.

