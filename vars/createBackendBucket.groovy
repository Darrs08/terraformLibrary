def call () {
  withAWS(region: "${awsRegion}", credentials: "${userCred}") {
    awsIdentity()
    sh "aws s3api create-bucket --bucket ${bucketName} --region us-east-1"
  }
}
