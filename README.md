# config-server
 1. create git repository which contains all projects config file environment wise(dev, uat) in this example we have config-repo as .git repository (do not forget to put .git file once you clone it)
 2. create configuration server to read the git config repository
 3. create you application e.g. resturant and school and make necesaary configuration to read the properties/yaml values from git config repo thru congig server
 4. put encrypt.key: MySecretKeyHere in your config server properties
 
 you can put encrypted values in your config example-
 - curl -X POST http://localhost:8081/config/encrypt -d "110 Sing plaza, 209812" and get encrypted value e.g. 588d9117e7e46c2dea5c9a27d033fc28d9457fb9dd2092f94b8b17be8cca238369c2690c91adeaa9226d4943f8b13c7c
 - put value with cipher e.g. resturant.address: '{cipher}588d9117e7e46c2dea5c9a27d033fc28d9457fb9dd2092f94b8b17be8cca238369c2690c91adeaa9226d4943f8b13c7c'
 
 
Now you can run applications-
1. Config Server
2. Resturant Service
3. School Service 


and test the service-
- Resturant: http://localhost:8082/resturant
- Output: Resturant Name: Ang Mokia address : 110 Sing plaza, 209812 has total staff: 25
- School: http://localhost:8083/school
- Output: School Name: Sang Monio Address: 30-Mania nagar, 307651

Note: you can use profile to get dev or uat env config example spring.profiles.active: uat)