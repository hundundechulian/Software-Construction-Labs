package Application.AtomStructure;

import abs.PhysicalObject;

public class Nuclear extends PhysicalObject {

    public Nuclear(String label) {
        super(label);
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
