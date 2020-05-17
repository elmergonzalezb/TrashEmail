package io.github.teledot.Telegram;

import java.util.Date;

import io.github.teledot.Telegram.messageEntities.Chat;
import io.github.teledot.Telegram.messageEntities.From;

/* This is how a response looks like, which we are taking input as request
{
	"update_id": 90,
	"message": {
		"message_id": 6,
		"from": {
			"id": 9088787XXX,
			"is_bot": false,
			"first_name": "Rohit",
			"last_name": "Sehgal",
			"username": "r0hi7",
			"language_code": "en"
		},
		"chat": {
			"id": 753469447,
			"first_name": "Rohit",
			"last_name": "Sehgal",
			"username": "r0hi7",
			"type": "private"
		},
		"date": 1588833291,
		"text": "Hi"
	}
}
 */
public class TelegramRequest {
    private Integer update_id;
    private Message message;

    public TelegramRequest() {
    }

    public class Message{
        private Integer message_id;
        private From from;
        private Chat chat;
        private Date date;
        private String text;

        public Message() {
        }

        public Chat getChat() {
            return chat;
        }

        public void setChat(Chat chat) {
            this.chat = chat;
        }

        public Integer getMessage_id() {
            return message_id;
        }

        public void setMessage_id(Integer message_id) {
            this.message_id = message_id;
        }

        public From getFrom() {
            return from;
        }

        public void setFrom(From from) {
            this.from = from;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public Integer getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Integer update_id) {
        this.update_id = update_id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
