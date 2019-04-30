
Please follow the format below for API Documentation

http://opensource.indeedeng.io/api-documentation/docs/job-search/
Method Name: 

Request Parameters:

Parameter_Name  Data_Type  Required Description  Default_value:  

API Sample Request:

API Sample Response: {JSON Format}



Method Name: ./like
Method: Get
// request parameters
    url = ./like
    params = 'user_id=' + user_id
    req = {}

Method: Post
//Request Parameters:
    url = ./like
    req = 
    {
      user_id: user_id,
      like: [{
         api_job_id : api_job_id, 
         job_title : job_title,
         location : location,
         job_snippet : job_snippet
      }]
     }
     
Method: Delete 
// request parameters
    url = ./like
    req = {
      user_id: user_id,
      like: [api_job_id]
    }

Parameter_Name  Data_Type  Required Description  Default_value:  

API Sample Request:

API Sample Response: {JSON Format}
{"result" : "SUCCESS"}


Method Name: ./apply
Method: Get
// request parameters
    url = ./apply
    params = 'user_id=' + user_id
    req = {}

Method: Post
//Request Parameters:
    url = ./apply
    req = 
    {
      user_id: user_id,
      apply: [{
         api_job_id : api_job_id, 
         job_title : job_title,
         location : location,
         job_snippet : job_snippet
      }]
     }

Parameter_Name  Data_Type  Required Description  Default_value:  

API Sample Request:

API Sample Response: {JSON Format}
{"result" : "SUCCESS"}



