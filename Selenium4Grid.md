# Week 2 

### Day 04

### Old Selenium Grid

    -> Hub (Master) -> Node (Slave) 
    Why do we need Grid? 
    1) Locally -> You can only test against particular browser version [Chrome, 83] + OS [10] 
    2) Test Lab -> 20 Machines -> Different Combinations -> Which machine -> need to run which scripts -> Manually -> M1 -> 001 - 100 (Chrome, 83, Windows) -> Manual efforts, if the machine is down or crashed -> all gone -> Cost of infra !! 
    Distributed and Scalable environment -> Grid [2.x] 
    Eclipse -> Test will go to Hub -> Ask you for the expected capablities [Browser, Version, Platform ] -> Checks for the matching node by capabilities -> matches first -> it will execute !! 
    Challenges -> All execution need to go through Hub and question of running 10K tests are difficult !! 

### Selenium 4 Grid
    
Note: 
- Use Selenium aplha-4 as on Sunday, 5th July 2020 and don't use alpha-6
- We can have below 4 components in 4 different machines as well. 

    
    There are 4 Components
        3. Router: Will be a componenbt which will send to distributor, whenever it gets a request to connect to new session. This is equivalent to hub.  
        1. Session Map: Place to store the session
        2. Distributor: If you go to temple, there will be multuple queues, sombody will tell you who will go to which queue. Distributor has similar activity. Distributor shuold connext/attach to the session. Distributor defaulty runs on 5553
        4. Node: Will be connected with Distributor. 
     
    Node    
        Balaji -> Java [Node] George -> Js [Node] Khaja -> Java [Node] 
    Session Map 
        Track of who is currently working on what Murali -> [Track Nodes] with their work [Session] 
    Distributor 
        Sheriba -> New Testcase -> Will find the right node -> Tell Murali I am using this person for doing this testcase 
    Router 
        Babu -> Manage the request 
    
    Use Case    
        Customer -> Babu -> Automate Se + Java test Customer -> Babu -> Sheriba [Se + Java] -> Find the best match [Balaji] -> Sheriba [Se + Js] -> Khaja -> Murali [Khaja, test2] -> Murali -> Babu [Balaji, Test!] -> Babu 
    
### Resources

Selenium Versions Jars \
https://selenium-release.storage.googleapis.com/index.html

Selenium alpha 4 \
https://selenium-release.storage.googleapis.com/index.html?path=4.0-alpha4/

