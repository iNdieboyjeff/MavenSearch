import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jeff on 21/12/2015.
 */
public class Utils implements ToolWindowFactory {
    private ToolWindow myToolWindow;
    private Project project;
    private JPanel rootContent;
    private JTextField textField1;
    private JTextField textField2;
    private JButton searchButton;
    private JTable table1;

    java.util.Timer timer;

    public Utils() {

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OkHttpClient client = new OkHttpClient();

                String uri = "http://search.maven.org/solrsearch/select?q=g:\"%s\"+AND+a:\"%s\"&core=gav&rows=20&wt=json";

                Request.Builder rb = new Request.Builder().url(uri.toString());
            }
        });
    }



    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        myToolWindow = toolWindow;
        this.project = project;
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(rootContent, "", false);
        toolWindow.getContentManager().addContent(content);
    }


}
