def call () {
   sh "terraform destroy --auto-approve"
   sh "aws s3 rb s3://${bucketName} --force"
}