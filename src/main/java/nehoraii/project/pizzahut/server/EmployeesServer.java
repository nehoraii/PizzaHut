package nehoraii.project.pizzahut.server;

import nehoraii.project.pizzahut.entity.EmployeesEntity;
import nehoraii.project.pizzahut.repository.EmployeesRepository;
import nehoraii.project.pizzahut.vo.EmployeesVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesServer {
    @Autowired
    private EmployeesRepository employeesRepository;
    public EmployeesServer(EmployeesRepository employeesRepository){
        this.employeesRepository=employeesRepository;
    }
    public Long save(EmployeesVo Vo){
        EmployeesEntity bean=new EmployeesEntity();
        BeanUtils.copyProperties(Vo,bean);
        bean=employeesRepository.save(bean);
        return bean.getId();
    }
    public Long delete(Long Id){
        employeesRepository.deleteById(Id);
        return Id;
    }
    public EmployeesEntity getByIDEmployee(Long Id) throws Exception {
        EmployeesEntity employeesEntity;
         employeesEntity=employeesRepository.getByIDEmployee(String.valueOf(Id));
         if(employeesEntity==null){
             throw new IllegalAccessException("Not found!!!");
         }
         return employeesEntity;
    }
}
