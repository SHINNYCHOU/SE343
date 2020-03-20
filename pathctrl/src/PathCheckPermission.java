import java.security.Permission;

public class PathCheckPermission extends Permission {

    private String action;
    public PathCheckPermission(String path,String action) {
        super(path);
        this.action=action;
    }

    @Override
    public boolean implies(Permission other) {
        if (!(other instanceof PathCheckPermission)) return false;
        PathCheckPermission b = (PathCheckPermission) other;

        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
        if (!getClass().equals(o.getClass())) return false;
        PathCheckPermission b = (PathCheckPermission) o;
        if (!action.equals(b.action)) return false;
        else return getName().equals(b.getName());
//        else return false;

    }

    @Override
    public int hashCode() {
        return getName().hashCode() + action.hashCode();
    }

    @Override
    public String getActions() {
        return action;
    }
}
