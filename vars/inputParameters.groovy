def call() {
  properties([
    parameters([
      string(
         name: 'environment', 
         defaultValue: 'terraform', 
         description: 'Workspace/environment file to use for deployment'
      ),
      booleanParam(
         name: 's3Bucket',
         defaultValue: false, 
         description: 'Create s3 bucket for backend?'
      ),
      booleanParam(
         name: 'autoApprove', 
         defaultValue: false, 
         description: 'Automatically run apply after generating plan?'
      ),
      booleanParam(
         name: 'destroy',
         defaultValue: false,
         description: 'Destroy Terraform build?'
      )
    ])
  ])
}