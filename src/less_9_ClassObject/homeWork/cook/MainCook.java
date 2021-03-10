package less_9_ClassObject.homeWork.cook;

import less_9_ClassObject.homeWork.cook.models.Cook;

/**
 * TheSusanin
 * 04 март 2021
 */
public class MainCook {
    public static void main(String[] args) {
        Cook cooker = new Cook("Жаныбек", 32);
        cooker.cook("Омлет");
    }
}
