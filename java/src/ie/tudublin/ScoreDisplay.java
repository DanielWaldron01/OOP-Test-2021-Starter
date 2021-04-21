package ie.tudublin;

import java.util.ArrayList;

import ddf.minim.AudioOutput;
import ddf.minim.Minim;
import ddf.minim.ugens.Oscil;
import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	//String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> notes = new ArrayList<Note>();

	int startNotes = -1;
	int endNotes = -1;

	float border;
	float gap = 25.0f;
	float start;
	float end;
	Minim m;
	Oscil o;
	AudioOutput ap;
	
	
	public void settings()
	{
		size(1000, 500);
	}

	// How to convert a character to a number
	char c = '7'; // c holds the character 7 (55)
	int i = c - '0'; // i holds the number 7 (55 - 48) 
	//println(i);

	void loadScore()
	{
			for(int i = 0; i < score.length(); i++)
			{
				if(i !=  score.length() - 1 )
				{
					char NoteValue = score.charAt(i);

					char NumberCheck = score.charAt(i+1);

					boolean isNumber = Character.isDigit(NoteValue);

					boolean NextNumber = Character.isDigit(NumberCheck);
					//println(isNumber);

					if(isNumber == false)
					{
						if(NextNumber == true)
						{
							Note s = new Note(NoteValue, 2);
							notes.add(s);
						}
						else
						{
							Note s = new Note(NoteValue, 1);
							notes.add(s);
						}
					}
            		
				}

			}

	}

	void printScore()
	{
		for(Note n: notes)
		{
			println(n);
		}
	}

	public void setup() 
	{
		loadScore();
		printScore();
		drawNotes();
	}

	public void draw()
	{
		float border = 0.1f * width;
		
		background(255, 255, 255);
		line(border, gap * 8, border * 9, gap * 8);
		line(border, gap * 9, border * 9, gap * 9);
		line(border, gap * 10, border * 9, gap * 10);
		line(border, gap * 11, border * 9, gap * 11);
		line(border, gap * 12, border * 9, gap * 12);
		drawNotes();
		fill(0);
	
	}

	void drawNotes()
	{
		float border = 0.1f * width;
	

		for(Note n: notes)
		{
			println(n);
		}
		circle(border + gap, (gap * 12) + gap / 2, 25);

		circle(border + (gap * 3), (gap * 12), 25);

	
		
	}

	
}
