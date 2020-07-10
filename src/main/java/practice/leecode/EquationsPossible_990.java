package practice.leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;


public class EquationsPossible_990 {

    public boolean equationsPossible(String[] equations) {
        List<Expression> expressions = new ArrayList<>();
        for (String equation : equations) {
            expressions.add(new Expression(equation));
        }

        return true;
    }

    @Data
    public static class Expression {

        private String left;
        private String right;
        private OperationEnum operation;

        public Expression(String equation) {
            this.left = equation.substring(0, 1);
            this.right = equation.substring(3,4);
            this.operation = OperationEnum.getOperationEnum(equation.substring(1,3));
        }

    }

    public enum OperationEnum {

        EQUAL("=="), UNEQUAL("!=");

        private String value;

        private static Map<String, OperationEnum> enumMap = new HashMap<>();

        OperationEnum(String value) {
            this.value = value;
        }

        static {
            for (OperationEnum operationEnum : OperationEnum.values()) {
                enumMap.put(operationEnum.value, operationEnum);
            }
        }

        public static OperationEnum getOperationEnum(String value) {
            return enumMap.get(value);
        }

    }

}


