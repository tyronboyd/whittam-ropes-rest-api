package com.whittam.ropes;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocketHandler extends TextWebSocketHandler {

	List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

	// This will send only to one client(most recently connected)
	public void counterIncrementedCallback() {
		if (!sessions.isEmpty()) {
			for (WebSocketSession session : sessions) {
				if (session.isOpen()) {
					try {
						session.sendMessage(new TextMessage("{\"value\": \"order added\"}"));
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Don't have open session to send:");
				}
			}
		}
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) {
		System.out.println("Connection established");
		this.sessions.add(session);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		for (WebSocketSession webSocketSession : sessions) {
			webSocketSession.sendMessage(new TextMessage("Hello " + message.getPayload()));
		}
	}

}