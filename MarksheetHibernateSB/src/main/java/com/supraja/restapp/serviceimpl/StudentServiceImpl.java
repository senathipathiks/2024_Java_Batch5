[Yesterday 11:00 PM] Keerthana Prabu
package com.keerthana.demo.ServiceImpl;
 
import java.util.List;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.keerthana.demo.Model.MarksBean;
 
import com.keerthana.demo.Model.StudentBean;
import com.keerthana.demo.Repo.StudRepo;
import com.keerthana.demo.Service.StudService;
 
import jakarta.persistence.EntityManager;
 
@Service
public class StudServiceImpl implements StudService {
 
	@Autowired
	StudRepo studRepo;
 
	@Autowired
	EntityManager eman;
	@Override
	public String addStudent(StudentBean stu,int cId) {
		
			MarksBean py=eman.find(MarksBean.class, cId);
			if(py!=null) {
				stu.setMarks(py);
				studRepo.save(stu);
				return "saved";
				
			}else {
				return "no";
			}
	}
	
	@Override
	public List<StudentBean> getAllStudents() {
		// TODO Auto-generated method stub
		return studRepo.findAllStudents();
	}
 
	public String updateEmployee(StudentBean stu) {
		studRepo.update(stu);
		return "Success";
	}
 
	public StudentBean getEmployee(int id) {
		// TODO Auto-generated method stub
		return studRepo.findById(id);
	}
 
	public String deleteStud(int id) {
		// TODO Auto-generated method stub
		return studRepo.deleteById(id);
	}
 
}
 
 
 