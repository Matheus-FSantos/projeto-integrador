package br.com.senacsp.projetointegrador;

import java.sql.SQLException;
import java.util.List;

import br.com.senacsp.projetointegrador.model.dao.AddressDAO;
import br.com.senacsp.projetointegrador.model.dao.CompanyDAO;
import br.com.senacsp.projetointegrador.model.domain.Address;
import br.com.senacsp.projetointegrador.model.domain.Company;
import br.com.senacsp.projetointegrador.model.domain.Employee;
import br.com.senacsp.projetointegrador.model.service.EmployeeService;

public class App {

	public void init() {
		
		try {
			this.employee();
			this.company();
			this.address();
		} catch(SQLException sqlException) {
			System.out.println(sqlException.getMessage());
		}
		
	}
	
	public void employee() throws SQLException {
		//List<Employee> employees = null;
		//Employee employee = null;
		//Employee employeeByMail = null;
		//Employee savedEmployee = null;
		//Employee updatedEmployee = null;
		
		//employees = new EmployeeService().findAll();
		//employee = new EmployeeService().findById("d2ac71a9-f994-11ed-89c8-ec63d7ea86d4");
		//employeeByMail = new EmployeeService().findByMail("joao@gmail.com");
		//savedEmployee = new EmployeeService().save("Delete teste", "deleteTeste@gmail.com", "666666", "331687665", "69487309063", "Microsoft");
		//new EmployeeService().delete("cb3262d7-f9a6-11ed-89c8-ec63d7ea86d4");
		//updatedEmployee = new EmployeeService().update("Rafael Fagundes Filho", "frafael.fagundes@gmail.com", "131570237", "07404389054", "d34e27e3-f9a4-11ed-89c8-ec63d7ea86d4");

	}
	
	public void company() throws SQLException {
		Company company = new CompanyDAO().findById("7333ba66-f994-11ed-89c8-ec63d7ea86d4");
		
		System.out.println(company);
	}
	
	public void address() throws SQLException {
		Address address = new AddressDAO().findByAddressName("Rua Júlio Fernandes");
		
		System.out.println(address);
	}
	
}
