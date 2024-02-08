package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
//todo: codeStyle - лишние import-ы удаляются одним нажатием комбинации hotKeys
public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
