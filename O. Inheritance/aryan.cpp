#include<iostream>
#include<GL/glut.h>

using namespace std;

void Reshape(int w, int h);
void Display();
void CreateCube(int a, int b, int c, int d);
void SetCoordinates();
void Mouse(int button, int state, int x, int y);
void SpinCube();

GLfloat Vertex[][3]
{
	{-1.0, -1.0, 1.0},
	{ 1.0, -1.0, 1.0},
	{ 1.0,  1.0, 1.0},
	{-1.0,  1.0, 1.0},
	{-1.0, -1.0, -1.0},
	{ 1.0, -1.0, -1.0},
	{ 1.0,  1.0, -1.0},
	{-1.0,  1.0, -1.0},
};

GLfloat Color[][3]
{
	{ 1.0, 0.0, 0.0 },
	{ 0.0, 0.0, 1.0 },
	{ 0.0, 1.0, 0.0 },
	{ 0.0, 1.0, 1.0 },
	{ 1.0, 0.0, 0.0 },
	{ 1.0, 0.0, 1.0 },
	{ 1.0, 1.0, 0.0 },
	{ 1.0, 1.0, 1.0 },
};

GLfloat theta[] = {45.0, 0.0, 30.0};

static GLint Angle = 1;

int main(int a, char **c)
{
	glutInit(&a, c);
	glutInitWindowSize(500,500);
	glutInitWindowPosition(100,100);
	glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
	glutCreateWindow("Practice");
	glutDisplayFunc(Display);
	glutReshapeFunc(Reshape);
	glutMouseFunc(Mouse);
	glutIdleFunc(SpinCube);
	glEnable(GL_DEPTH_TEST);	
	glutMainLoop();
}

void Mouse(int button, int state, int x, int y)
{
	if(button == GLUT_LEFT_BUTTON && state == GLUT_DOWN) Angle =0;
	if(button == GLUT_MIDDLE_BUTTON && state == GLUT_DOWN) Angle =1;
	if(button == GLUT_RIGHT_BUTTON && state == GLUT_DOWN) Angle =2;
}

void SpinCube()
{
	theta[Angle] += 0.89;
	if(theta[Angle] == 360.0)
		theta[Angle] -= 360.0;

	glutPostRedisplay();
}

void CreateCube(int a, int b, int c, int d)
{
	glBegin(GL_POLYGON);

	glVertex3fv(Vertex[a]);
	glColor3fv(Color[a]);

	glVertex3fv(Vertex[b]);
	glColor3fv(Color[b]);

	glVertex3fv(Vertex[c]);
	glColor3fv(Color[c]);

	glVertex3fv(Vertex[d]);
	glColor3fv(Color[d]);	
	
	glEnd();
	glFlush();
}

void SetCoordinates()
{
	CreateCube(0,1,2,3);
	CreateCube(1,2,6,5);
	CreateCube(4,5,6,7);
	CreateCube(0,3,7,4);
	CreateCube(3,2,6,7);
	CreateCube(0,1,5,4);
}

void Reshape(int w, int h)
{
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(-2.0,2.0,-2.0,2.0,-2.0,2.0);
	glMatrixMode(GL_MODELVIEW);
	glFlush();
}

void Display()
{
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glClearColor(0.0,0.0,0.0,1.0);
	glLoadIdentity();
	glRotatef(theta[0], 0.0,0.0,1.0);
	glRotatef(theta[1], 0.0,1.0,0.0);
	glRotatef(theta[2], 1.0,0.0,0.0);
	SetCoordinates();
	glutSwapBuffers();
	glFlush();
}
