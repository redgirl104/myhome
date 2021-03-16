package com.mtess.myhome.validator;

import com.mtess.myhome.model.Board;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.StringUtils;

@Component
public class BoardValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Board.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Board b = (Board) o;
        if(StringUtils.isEmpty(b.getContent())){
            errors.rejectValue("content", "key","내용을 입력하세요");
        }
    }
}
