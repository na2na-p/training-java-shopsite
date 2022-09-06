package dev.na2na.trainingjavashopsite.action;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

public abstract class Action {
	public abstract String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception;
}
