package less_14_interface.models;

import less_14_interface.services.CashierService;

/**
 * TheSusanin
 * 3/17/2021
 */
public class CashierInterface extends EmployeeInterface implements CashierService {

    public CashierInterface(String name, double salary) {
        super(name, salary);
    }


    @Override
    public void sell() {

    }

    @Override
    public void cancelOper() {

    }
}
