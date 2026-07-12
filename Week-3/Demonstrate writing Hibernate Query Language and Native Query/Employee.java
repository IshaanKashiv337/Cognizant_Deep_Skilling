@ManyToOne
@JoinColumn(name = "em_dp_id")
private Department department;

public Department getDepartment() {
    return department;
}

public void setDepartment(Department department) {
    this.department = department;
}