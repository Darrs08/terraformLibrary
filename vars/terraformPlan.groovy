def call () {
   sh 'terraform init -migrate-state -input=false -backend-config="bucket=${bucketName}"'
   sh 'terraform workspace select ${environment} || terraform workspace new ${environment}'
   sh "terraform plan -input=false -out tfplan "
   sh 'terraform show -no-color tfplan > tfplan.txt'
}