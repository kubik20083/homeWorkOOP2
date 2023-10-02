public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    // abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean isMakeOrder) {
        this.isMakeOrder = isMakeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean isTakeOrder) {
        this.isTakeOrder = isTakeOrder;
    }

/*     @Override
    public String toString() {
        return "Actor [name=" + name + ", isMakeOrder=" + isMakeOrder + ", isTakeOrder=" + isTakeOrder + "]";
    } */
    
    
}
