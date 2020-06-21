# Run The NUMBER GENERATOR

###### step-1:Clone the code 
###### step-2: cd vmcode
###### step-2:run "docker build -t myorg/myapp ." 
###### step-3:run " docker run -p 8181:8181 myorg/myapp"

### Use Postman tool for below request call 
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



# Login Application

###### step-1:Clone the code 
###### step-2: cd vmloginapp
###### step-3: npm install
###### step-4: npm start
###### step-5: Enter the url in browser
               http://localhost:8080/login





# VMwareCode


Question 1-NUMBER GENERATOR

 

Write a spring boot application that generates number:

 

The below API should write into a file /tmp/{TASK_ID}_output.txt in the descending order  ,a sequence of numbers in the decreasing order till 0 , with step and start number given  as input  ;The First API returns a task;When the status of the task is called, the second API , it has to return appropriate status SUCCESS if done or IN_PROGRESS if task is still running;

The third API when called with a completed task should return the list of numbers reading from the file;

 

Expectation:

 

1_Best design practices with modularity and class and type definitions , OO principles to be should be followed;

2_Documentation to run the code

3_Relevant test cases;

 

 

            API_1

            POST /api/generate

            {

               "Goal":"10",

               "Step":"2"

            }

 

            Return

 

            202 ACCEPTED

            {

                        "task":"UUID of the task",

 

            }

 

            API_2

 

            GET /api/tasks/{UUID of the task}/status

 

            return

 

            { "result":"SUCCESS/IN_PROGRESS/ERROR" }

 

 

            API_3

 

            GET /api/tasks/{UUID of the task}?action=get_numlist

            {

                        "result": "10,8,6,4,2,0"

            }

 

 

Question 2 _Networks:

            2.1Explain the concepts of Default Gateway in IP

            2.2Explain the concepts of SNAT and DNAT

            2.3

 

            A.192.168.101.2/24

            B.192.168.101.3/24

            C.192.168.102.2/24

            D.192.168.102.3/24

 

            A,B,C,D are the IPs to be assigned to four computers ;

            2.1What network elements are need to arrive at the above network architecture and their configurations in terms at L3/L2

            Details of the IP assignments to be given to each node ;

            2.4 - Explain ARP

 

 

 

Question 3 – UI – Only For Full Stack

For Full Stack: UI Question in addition to the Spring App

 

 

Front End Question –

Create 2 screens, login and home screen.
Login screen should have username(email) and password(min length) field with login button.
On entering valid entries login button should be enabled and submit action should take user to home screen with welcome user message.
Angular features expected
Routing(login to home)
Field validators(login form error binding)
UserService component - Mock service to validate successful login
[Validate User function should check valid email and password of min length 6]

Add a readme content which has steps to run the UI.
NOTE –
c.       Recommended to use latest Angular version(any version). 

d.       If no prior angular2+ experience, AngularJS 1.0 is also fine.

 

 
