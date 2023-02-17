import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *

verts = (
    (1, -1, -1),
    (1, 1, -1),
    (-1, 1, -1),
    (-1, -1, -1),
    (1, -1, 1),
    (1, 1, 1),
    (-1, -1, 1),
    (-1, 1, 1),
)

edges = (
    (0,1),(0,3),(0,4),(2,1),
    (2,3),(2,7),(6,3),(6,4),
    (6,7),(5,1),(5,4),(5,7),
)

surfaces = (
    (0, 1, 2, 3),
    (3, 2, 7, 6),
    (6, 7, 5, 4),
    (1, 5, 7, 2),
    (4, 5, 1, 0),
    (4, 0, 3, 6),
)

colors = (
    (1, 0, 0),
    (0, 1, 0),
    (0, 0, 1),
    (0,0,0),
    (1,1,1),
    (0,1,1),
    (1, 0, 0),
    (0, 1, 0),
    (0, 0, 1),
    (0,0,0),
    (1,1,1),
    (0,1,1),
)

def Cube():
    glBegin(GL_QUADS)
    x = 0
    for surface in surfaces:
        x+=1
        for vertex in surface:
            glColor3fv(colors[x])
            glVertex3fv(verts[vertex])
    glEnd()
    
    glBegin(GL_LINES)
    for edge in edges:
        for vertex in edge:
            glVertex3fv(verts[vertex])


    glEnd()


def main():
    pygame.init()
    display = (1280, 720)
    pygame.display.set_mode(display, DOUBLEBUF|OPENGL)
    clock = pygame.time.Clock()

    glEnable(GL_DEPTH_TEST)

    glMatrixMode(GL_PROJECTION)
    gluPerspective(90, (display[0]/display[1]), 0.1, 50.0)

    glMatrixMode(GL_MODELVIEW)
    pos, back = 0.0, -5.0
    glTranslatef(pos, 0.0, back)
    
    while True:
        clock.tick(60)
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()

        keys = pygame.key.get_pressed()
        if keys[pygame.K_LEFT]:
            glTranslatef(-0.1, 0.0, 0.0)
            print('key left')
        elif keys[pygame.K_RIGHT]:
            glTranslatef(0.1, 0.0, 0.0)
            print('key right')
        elif keys[pygame.K_UP]:
            glTranslatef(0.0, 0.1, 0.0)
            print('key up')
        elif keys[pygame.K_DOWN]:
            glTranslatef(0.0, -0.1, 0.0)
            print('key down')

        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        Cube()
        pygame.display.flip()
main()