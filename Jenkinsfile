def gv


pipeline {
 agent any

 
   stages{


        stage("init") {
       steps{
         script {
           gv = load "script.groovy"
         }


       }

}

     stage("build") {
      
    
       steps{
           script{
               gv.buildApp()
           }
        
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
       params.VERSION == "1.1.0"
     }
   }

       steps{
         script {
             gv.deployApp()
         }
            }
}
}
}

