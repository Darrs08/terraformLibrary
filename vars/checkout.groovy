def call () {
  dir(params.environment) {
    git "https://github.com/Darrs08/terraform-sample.git"
  }
}
