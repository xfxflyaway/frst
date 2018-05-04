package com.simpleway.frst.shiro;

import java.io.Serializable;

import org.apache.shiro.util.SimpleByteSource;

public class ShiroSimpleByteSource extends SimpleByteSource implements Serializable {

	public ShiroSimpleByteSource(String string) {
		super(string);
	}
	
}
