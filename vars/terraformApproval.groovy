def call () {
  def plan = readFile 'tfplan.txt'
  input message: "Do you want to apply the plan?",
  parameters: [text(name: 'Plan', description: 'Please review the plan', defaultValue: plan)]
}