

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.test.Employee;

public class MainClass {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("cons_applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Object obj = factory.getBean("empBean");
		Employee emp = (Employee) obj;
		System.out.println(emp.getId() + "--" + emp.getName() + "--" + emp.getSalary());
		System.out.println(emp);
		emp.displayInfo();

	}

}
