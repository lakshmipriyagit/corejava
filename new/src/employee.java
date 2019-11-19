
public class employee {
	int EmpNo;
	String EmpName;
public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		this.EmpNo = empNo;
	}
	public String getEmpName() {
		return EmpName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
		result = prime * result + EmpNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		if (EmpName == null) {
			if (other.EmpName != null)
				return false;
		} else if (!EmpName.equals(other.EmpName))
			return false;
		if (EmpNo != other.EmpNo)
			return false;
		return true;
	}
	public void setEmpName(String empName) {
		this.EmpName = empName;
	}
public static void main(String[] args) {
	
}
}
