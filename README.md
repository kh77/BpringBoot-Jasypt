# Spring Boot Jasypt

## H2 UI url 
http://localhost:8080/h2-ui/

- Data is populated after running application. Please check resource folder for given schema and initial data script.
- Hit this endpoint, localhost:8080/employees

## Jasypt Encryption
- Encryption key is being used to encrypt and decrypt the data on the fly when application starts
- There is a test class JasyptEncryptorConfigTests, run that class to copy that encrypted value into the properties file like below:
  ENC(aAVASERVMNAOS!##@%##) 
  
- When you run the application it will automatically decrypt the data based on encrypted private key. Encrypted key is being passed on the fly as a Environment variable.
  
  ENCRYPTED_KEY=hello-world