package cn.rayest.validatorMy;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * Created by Rayest on 2016/8/22 0022.
 */
public class SensitiveWordValidators extends FieldValidatorSupport {

    public void validate(Object object) throws ValidationException {
        String fieldName = this.getFieldName();
        String value = this.getFieldValue(fieldName, object).toString();
        if (!check(value)) {
            this.addFieldError(fieldName, object);
        }
    }

    public boolean check(String value) {
        String[] sensitiveWords = {"习近平", "共产党"};
        for (int i = 0; i < sensitiveWords.length; i++) {
            if (value.indexOf(sensitiveWords[i]) > -1) {
                return false;
            }
        }
        return true;
    }

}
