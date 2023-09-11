# Backend Test Automation Assignment [![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/from-referrer/)

<a href="https://gitpod.io/from-referrer/" style="padding: 10px;">
    <img src="https://gitpod.io/button/open-in-gitpod.svg" width="150" alt="Push">
</a>

## Requirements
### Environment
* GitHub account
* Java 11 (JDK) (optionally)
* Maven 3.6+ (optionally)
* Any IDE you comfortable with (eg. IntelliJ, VSCode)

### Skills
* Java 8+ (coding standards)
* Clean Code
* Maven
* Git, GitLab, GitHub

### Instructions
Fork this project
<details>
<summary>Example</summary>

   ![img.png](doc/img/01_fork_project.png)
</details>

#### Working in Web IDE (preferable)

1. Open Project in [GitPod](https://gitpod.io/from-referrer/):
2. Sing-in with GitHub account
3. Create and commit your solution into your forked repository
4. Create documentation in the README.md under the `Documentation` section
5. IMPORTANT: Enable Repository permissions (e.g. git push) for GitPod when coding from Web IDE here:
   https://gitpod.io/integrations
   <details>
   <summary>Details here</summary>

   Edit permission for GitHub:

   ![img.png](doc/img/02_integration_providers.png)

   ![img.png](doc/img/02_enable_repo_permissions.png)
   </details>

## Documentation

##################################   ABN QA BACKEND ASSIGNMENT   ####################################################### 

#### WORK FLOW THE ASSIGNMENT


#### OVERVIEW

The Gitlab Issues assignment involves testing the API. To begin with, the provided document was thoroughly reviewed.
The subsequent steps to be followed were documented in a workflow diagram. Initially, a Gitlab account was created, 
and the application's functionalities were examined. Subsequently, an OAuth2 token, necessary for running the tests, 
was obtained. Manual tests were conducted on several API endpoints, covering the CRUD operations outlined in the 
instructions.

Following that, an automation testing framework was set up in IntelliJ. The tests that were initially conducted manually
in Postman were executed automatically within this framework. In the final stage, after conducting all necessary checks, 
the assignment, along with the Postman collection, was sent to the relevant individual.

#### CREATING A COLLECTION IN POSTMAN (For Manual Testing)

A Postman collection was created to encompass CRUD (Create, Read, Update, Delete) operations. An environment was
established, tailored to this collection. Subsequently, the pertinent APIs were executed utilizing the POST, GET, PUT, 
and DELETE methods. Code was scripted within the test section to verify the successful execution of the tests. 
It was observed that the tests ran successfully.


#### CREATING A FRAMEWORK IN INTELLIJ (For Automation Testing)

To automate the tests, an automation framework was developed following the Page Object Model in IntelliJ IDE. 
The necessary RestAssured  library for automation were included in the pom.xml file. Two packages were
created, namely 'Services' and 'Step_Defs.' In the 'Services' package, methods were written to execute the 
corresponding endpoints and assert their outcomes. It was verified that all the tests ran successfully.


#### CLOSURE THE ASSIGNMENT  

The assignment was concluded once it was confirmed that all positive tests ran successfully. Subsequently, 
all the data was forwarded to the designated individual as per the provided instructions.

