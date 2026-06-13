import java.util.*;

public class Codec {

public String serialize(
TreeNode root){

StringBuilder sb=
new StringBuilder();

dfs(
root,
sb
);

return sb.toString();
}

void dfs(
TreeNode node,
StringBuilder sb
){

if(node==null){

sb.append(
"null,"
);

return;
}

sb.append(
node.val
)
.append(",");

dfs(
node.left,
sb
);

dfs(
node.right,
sb);
}

public TreeNode deserialize(
String data){

Queue<String> q=
new LinkedList<>(
Arrays.asList(
data.split(",")
)
);

return build(q);
}

TreeNode build(
Queue<String> q
){

String val=
q.poll();

if(
val.equals(
"null"
)
)
return null;

TreeNode node=
new TreeNode(
Integer.parseInt(
val
)
);

node.left=
build(q);

node.right=
build(q);

return node;
}
}