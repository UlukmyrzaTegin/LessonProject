package less_14_interface.models;

import less_14_interface.services.AdministratorService;

/**
 * TheSusanin
 * 3/17/2021
 */
public class AdministratorInterface extends EmployeeInterface implements AdministratorService {

    public AdministratorInterface(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void income() {

    }

    @Override
    public void openOerDay() {

    }

    @Override
    public void closeOperDay() {

    }
}
