package game;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //创建二维数组（设置图片的随机位置）
    int[][] data = new int[4][4];
    //创建二维数组（存入拼图正确的位置）
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义步数
    int step = 0;

    int x = 0, y = 0;/*记录空白块的二维数组位置*/

    //记录图片的路径
    String path = "..\\helloworld\\src\\game\\image\\animal\\animal3\\";

    // 创建子菜单
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        // 初始化窗口
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        // 初始化图片
        initImage();


        this.setVisible(true);


    }

    private void initData() {
        // 初始化图片的序号
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // 随机获取图片序号且进行交换
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        // 将交换后的序号存入二维数组中
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = arr[i];

        }
    }

    private void initImage() {
        // 初始化先清空一下
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel logo = new JLabel(new ImageIcon("..\\helloworld\\src\\game\\image\\win.png"));
            logo.setBounds(203, 283, 197, 73);
            this.getContentPane().add(logo);

        }

        // 创建步数的计数显示
        JLabel stepCount = new JLabel("步数:" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        // 添加图片的细节：先加载的图片在上方，后加载的图片在下方
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取图片的序号
                int num = data[i][j];
                // 创建JLabel的管理容器
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                // 指定图片的位置
                jLabel.setBounds(j * 105 + 83, i * 105 + 134, 105, 105);
                // 添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 将管理容器添加到界面中
                this.getContentPane().add(jLabel);

            }
        }

        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("..\\helloworld\\src\\game\\image\\background.png"));
        // 设置背景图片大小和位置
        background.setBounds(40, 40, 508, 560);
        // 添加背景图片到界面中
        this.getContentPane().add(background);
        // 刷新一下界面
        this.getContentPane().repaint();
    }

    private void initJFrame() {
        // 设置界面宽高
        this.setSize(603, 680);
        // 设置界面的标题
        this.setTitle("拼图游戏单机版");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消居中方式
        this.setLayout(null);
        // 给整个界面添加键盘监听事件
        this.addKeyListener(this);

    }

    private void initJMenuBar() {
        // 创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        // 初始化菜单
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutjMenu = new JMenu("关于我们");


        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //子菜单添加到菜单
        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeItem);

        aboutjMenu.add(accountItem);

        //菜单添加到对象
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutjMenu);
        this.setJMenuBar(jMenuBar);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {/*按下‘A’,显示完整图片界面*/
            this.getContentPane().removeAll();

            // 添加完整的图片
            JLabel all = new JLabel(new ImageIcon(path + "\\all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            // 重新添加背景图片
            JLabel background = new JLabel(new ImageIcon("..\\helloworld\\src\\game\\image\\background.png"));
            // 设置背景图片大小和位置
            background.setBounds(40, 40, 508, 560);
            // 添加背景图片到界面中
            this.getContentPane().add(background);

            // 刷新一下界面
            this.getContentPane().repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 键盘键对应数字：左-37 上-38 右-39 下-40   A-65

        //return 表示越界时，结束移动

        //判断是否胜利，胜利结束代码
        if (victory()) {
            return;
        }

        int code = e.getKeyCode();
//        System.out.println(code);
        if (code == 37) {
            if (y == 0) {
                return;
            }
            // 左移图片
            int temp = data[x][y];
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = temp;
            --y;

            // 移动步数加1
            ++step;
            initImage();
        } else if (code == 38) {
            if (x == 3) {
                return;
            }
            // 上移图片
            int temp = data[x][y];
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = temp;
            ++x;

            // 移动步数加1
            ++step;
            initImage();

        } else if (code == 39) {
            if (y == 3) {
                return;
            }
            // 右移图片
            int temp = data[x][y];
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = temp;
            ++y;

            // 移动步数加1
            ++step;
            initImage();
        } else if (code == 40) {
            if (x == 0) {
                return;
            }
            // 下移图片
            int temp = data[x][y];
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = temp;
            --x;

            // 移动步数加1
            ++step;
            initImage();
        } else if (code == 65) {/*松开‘A’,进入拼图界面*/
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    // 判断是否胜利
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] != win[i][j]) {
                    // 只要有一个不一样返回false
                    return false;
                }
            }
        }
        // 全部相同返回true
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("重新游戏");
            // 重新统计步数
            step = 0;
            // 重新打乱图片
            initData();
            // 重新生成图片界面
            initImage();

        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            // 关闭游戏界面
            this.setVisible(false);
            // 跳转到登录界面
            new LoginJFrame();
        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            //关闭虚拟机退出游戏
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("公众号");
            // 创建弹框对象
            JDialog jDialog = new JDialog();
            // 创建JLabel的容器
            JLabel jLabel = new JLabel(new ImageIcon("D:\\IdeaProjects\\helloworld\\src\\game\\image\\about.png"));
            // 设置图片的位置和大小
            jLabel.setBounds(0,0,258,258);
            // 把图片加载到弹框
            jDialog.getContentPane().add(jLabel);
            // 设置弹框的大小
            jDialog.setSize(344,344);
            // 让弹框置顶
            jDialog.setAlwaysOnTop(true);
            // 设置弹框居中
            jDialog.setLocationRelativeTo(null);
            // 弹框不关闭，无法点击界面
            jDialog.setModal(true);
            // 让弹框显示出来
            jDialog.setVisible(true);

        }
    }
}
