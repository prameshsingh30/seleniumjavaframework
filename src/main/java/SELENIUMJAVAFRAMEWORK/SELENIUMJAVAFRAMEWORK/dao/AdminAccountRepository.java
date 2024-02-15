package SELENIUMJAVAFRAMEWORK.SELENIUMJAVAFRAMEWORK.dao;

import SELENIUMJAVAFRAMEWORK.SELENIUMJAVAFRAMEWORK.entity.AdminAccount;
import org.springframework.data.repository.CrudRepository;

public interface AdminAccountRepository extends CrudRepository <AdminAccount, Long> {

    public AdminAccount findByAdminName(String adminName);

}
