package com.ty.base.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ty.base.tools.DateFormat;

@RunWith(Suite.class)
@SuiteClasses({DateFormat.class,TestIORead.class})
public class JunitTestSuite {
	
	
}
