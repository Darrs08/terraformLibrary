def call () {
   sh "terraform output --json > Terraform_Output.json"
}