package com.isi.greatfictivco.controller;

import com.isi.greatfictivco.view.ViewController;

public class OtherController {
private ViewController viewController;
	
	public OtherController(String title){
		this.viewController = new ViewController(this, title);
	}
}
