package casting;

public class CommanClass {
    public static void main(String[] args) {
        /**
         * Upcasting - Upcasting is done internally and due to
         * upcasting, the object is allowed to access only the
         * parent class members and child class specified
         * members(overriden methods) but not all members of
         * child class
         */
        Parent p = new Child(); //Upcasting
        p.setWorkDomain("finance");
        p.work(); //->because it belongs to parent and overriden


        /**
         * Downcasting - You downcast the objects to access their
         * subclass-specific methods.
         *
         * Before performing downcasting, it’s good practice to check
         * if the object is actually an instance of the subclass using
         * the instanceof operator to avoid a ClassCastException.
         */
        if(p instanceof Child){
            Child c = (Child) p;
            c.play(); //-> we can access child class members by downcasting
        }

    }
}
