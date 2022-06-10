/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.event.MouseEvent.BUTTON1;
import static java.awt.event.MouseEvent.BUTTON2;
import static java.awt.event.MouseEvent.BUTTON3;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;


/**
 *
 * @author nickb
 */
public class GameBoardPanel extends javax.swing.JPanel {

    /**
     * Creates new form GameBoardPanel
     */
    
    private int boardSize,minesCount;
    private Image boardImage;
    public static int N = 8;
    GameModel gameModel;
    GraphicComponent graphicComponent;
 
    
    public GameBoardPanel(int boardSize,int minesCount) {
 
        initComponents();
        this.boardSize = boardSize;
        this.minesCount = minesCount;
        gameModel = new GameModel(boardSize,minesCount);
        graphicComponent = new GraphicComponent(gameModel);
        
         try {
            boardImage = new ImageIcon("Images/board.png").getImage(); 
            
        } catch (Exception e) {
            
        }
        if(this.boardSize == 1)
        {
            final Dimension dimension = new Dimension(N*Cell.SizeCell*this.boardSize, N*Cell.SizeCell*this.boardSize);
            
            this.setMinimumSize(dimension);
            this.setPreferredSize(dimension);
        }
            
        else if(this.boardSize == 2)
        {
            
            final Dimension dimension = new Dimension(N*Cell.SizeCell*this.boardSize, N*Cell.SizeCell);
            
            this.setMinimumSize(dimension);
            this.setPreferredSize(dimension);
           
     
        }
        else
        {
          
            final Dimension dimension = new Dimension(N*Cell.SizeCell*this.boardSize/2, N*Cell.SizeCell*this.boardSize/2);
            
            this.setMinimumSize(dimension);
            this.setPreferredSize(dimension);
        }
        

        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
           g.drawImage(boardImage, 0,0, N*Cell.SizeCell,N*Cell.SizeCell, this);
        
        if(this.boardSize >= 2)
        {
            g.drawImage(boardImage,N*Cell.SizeCell,0, N*Cell.SizeCell,N*Cell.SizeCell, this);
        }
        if(this.boardSize == 4)
        {
            g.drawImage(boardImage,0,N*Cell.SizeCell, N*Cell.SizeCell,N*Cell.SizeCell, this);
            g.drawImage(boardImage,N*Cell.SizeCell,N*Cell.SizeCell, N*Cell.SizeCell,N*Cell.SizeCell, this);
        }
        
    }

    

     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        looseDialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();

        winDialog.setTitle("WINNER!!!!");
        winDialog.setAlwaysOnTop(true);
        winDialog.setBackground(new java.awt.Color(255, 255, 255));
        winDialog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        winDialog.setLocation(new java.awt.Point(0, 0));
        winDialog.setPreferredSize(new java.awt.Dimension(2000, 2000));
        winDialog.setResizable(false);
        winDialog.setSize(new java.awt.Dimension(420, 130));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("You Won!!!");

        javax.swing.GroupLayout winDialogLayout = new javax.swing.GroupLayout(winDialog.getContentPane());
        winDialog.getContentPane().setLayout(winDialogLayout);
        winDialogLayout.setHorizontalGroup(
            winDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winDialogLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1613, Short.MAX_VALUE))
        );
        winDialogLayout.setVerticalGroup(
            winDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1897, Short.MAX_VALUE))
        );

        looseDialog.setTitle("You LOOSE!!!!");
        looseDialog.setAlwaysOnTop(true);
        looseDialog.setSize(new java.awt.Dimension(420, 130));

        jLabel2.setFont(new java.awt.Font("Vivaldi", 0, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("You Loose!");

        javax.swing.GroupLayout looseDialogLayout = new javax.swing.GroupLayout(looseDialog.getContentPane());
        looseDialog.getContentPane().setLayout(looseDialogLayout);
        looseDialogLayout.setHorizontalGroup(
            looseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(looseDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        looseDialogLayout.setVerticalGroup(
            looseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(looseDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        int col = evt.getX() / Cell.SizeCell;
        int row = evt.getY() / Cell.SizeCell;
        System.out.println("Click! "+ row +" " + col);
        if(!gameModel.getGameOver())
        {
            if(SwingUtilities.isLeftMouseButton(evt))
            {
                if(!gameModel.getGameOver())
                {
                   gameModel.openCell(row, col);
                   if(gameModel.getGameOver())
                   {
                       graphicComponent.repaintOnlyBomb(row, col,this.getGraphics());
                       looseDialog.setLocationRelativeTo(this);
                       looseDialog.setVisible(true);
                       
                   }
                   else
                   {
                      graphicComponent.repaintBoard(this.getGraphics()); 
                     
                   }
                }
            }
            else if(SwingUtilities.isRightMouseButton(evt))
            {
                if(!gameModel.getCells()[row][col].isMarked)
                {
                   gameModel.getCells()[row][col].setIsMarked(Boolean.TRUE);
                   graphicComponent.markCell(row, col, this.getGraphics());
                   if(gameModel.checkWin())
                   {
                       winDialog.setLocationRelativeTo(this);
                       winDialog.setVisible(true);
                   }
                }
                else
                {
                   gameModel.getCells()[row][col].setIsMarked(Boolean.FALSE);
                   graphicComponent.unMarkCell(row, col, this.getGraphics());
                }
            }
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JDialog looseDialog;
    private javax.swing.JDialog winDialog;
    // End of variables declaration//GEN-END:variables

}