pipeline {
 agent any

 parameters {
   choice(name: 'VERSION', choices: ['1.1.0', '1.2.3','1.2.1'], description:'default values')
   booleanParam(name: 'executeTests', defaultValue: true,description: '')

 }
   stages{
     stage("build") {
      
      when{
        expression {
          params.executesTest
        }
      }
       steps{
         echo " The bult version is ${NEW_VERSION}"
            }
}

 stage("test") {
   

   steps{
          echo "test stage  "
            }
   }
       



 stage("deploy") {

   when{
     expression {
       BRANCH_NAME == "production"
       params.VERSION: "1.1.0"
     }
   }

       steps{
          echo "deploy stage Production branch "
            }
}
}
}

