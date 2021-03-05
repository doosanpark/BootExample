package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    // �޽��� Ÿ�� : ����, ä��
    public enum MessageType {
        ENTER, TALK
    }
    private MessageType type; // �޽��� Ÿ��
    private String roomId; // ���ȣ
    private String sender; // �޽��� �������
    private String message; // �޽���
}