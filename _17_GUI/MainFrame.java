package _17_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	// JPanel은 컨테이너&컴포넌트
	// 기본 레이아웃이 FlowLayout, 가운데부터 하나씩 정렬
	private JPanel title_P = new JPanel();
	private JLabel title = new JLabel("단어장 프로그램");
	private JPanel center_P = new JPanel();
	
	private JPanel center_L = new JPanel();		// 왼쪽
	private JPanel center_C = new JPanel();		// 중앙
	private JPanel center_R = new JPanel();		// 오른쪽
	
	// center_L 라벨 및 패널
	private JLabel addLabel = new JLabel("단어입력");
	private JPanel addPanel = new JPanel();
//	private JPanel addText = new JPanel();
	private JLabel addKorText = new JLabel("한글");
	private JLabel addEngText = new JLabel("영어");
//	private JPanel addInput = new JPanel();
	private JTextField addKorInput = new JTextField();
	private JTextField addEngInput = new JTextField();
	private JButton addBtn = new JButton("저장");
	// center_C 라벨 및 패널
	private JLabel listLabel = new JLabel("단어리스트");
	private List wordList = new List(5, false);
	private JButton delBtn = new JButton("선택단어삭제");
	// center_R 라벨 및 패널
	private JLabel modLabel = new JLabel("단어수정");
	private JPanel modPanel = new JPanel();
//	private JPanel modText = new JPanel();
	private JLabel modKorText = new JLabel("한글");
	private JLabel modEngText = new JLabel("영어");
//	private JPanel modInput = new JPanel();
	private JTextField modKorInput = new JTextField();
	private JTextField modEngInput = new JTextField();
	private JButton modBtn = new JButton("수정");
	
	MainFrame() {
		this.setBounds(100, 100, 500, 180);
		
		// 상단
		title_P.add(title);
		center_P.setBackground(Color.orange);
		this.add(title_P, "North");
		
		// 하단
		center_L.setBackground(Color.red);
		center_C.setBackground(Color.cyan);
		center_R.setBackground(Color.green);
		center_P.setLayout(new GridLayout());
		center_P.add(center_L);
		center_P.add(center_C);
		center_P.add(center_R);
		this.add(center_P, "Center");
		
		// center_L 작업
		addPanel.setLayout(new GridLayout(2, 2));
		addPanel.add(addKorText);
		addPanel.add(addKorInput);
		addPanel.add(addEngText);
		addPanel.add(addEngInput);
		center_L.setLayout(new BorderLayout());
		center_L.add(addLabel, "North");
		center_L.add(addPanel, "Center");
		center_L.add(addBtn, "South");
		// center_C 작업
		center_C.setLayout(new BorderLayout());
		center_C.add(listLabel, "North");
		center_C.add(wordList, "Center");
		center_C.add(delBtn, "South");
		// center_R 작업
		modPanel.setLayout(new GridLayout(2, 2));
		modPanel.add(modKorText);
		modPanel.add(modKorInput);
		modPanel.add(modEngText);
		modPanel.add(modEngInput);
		center_R.setLayout(new BorderLayout());
		center_R.add(modLabel, "North");
		center_R.add(modPanel, "Center");
		center_R.add(modBtn, "South");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
