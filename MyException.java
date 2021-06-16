package com.olympic.cis143.m05.student.lab.trycatch;
import java.lang.*;

public class MyException extends Exception
{
	private String message = "This is my error";
	Exception exceptionMine;
	MyException(String msg, Exception e)
	{
		exceptionMine = e;
		message = msg;
	}
}
