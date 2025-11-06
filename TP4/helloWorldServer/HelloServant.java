package helloWorldServer;

import org.omg.CORBA.ORB;

import HelloWorldApp.HelloPOA;

public class HelloServant extends HelloPOA{
	private String message ="bonjour tous le monde !! ";
	private ORB orb;
	public void setOrb(ORB orb) {
		this.orb=orb;
	}
	@Override
	public String HelloMessage() {
        return message;
		//auto gen
	}
	@Override
	public void HelloMessage(String newHelloMessage) {
		message=newHelloMessage;
	}

}
