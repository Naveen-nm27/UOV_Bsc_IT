<?php
session_start();
require "db.php";

$user = $_SESSION['user'];

$q = $conn->query("SELECT balance FROM accounts WHERE username='$user'");
$row = $q->fetch_assoc();
$balance = $row['balance'];
?>

<h2>Welcome, <?php echo $user; ?></h2>
<p>Your account balance: $<?php echo $balance; ?></p>

<form action="update_balance.php" method="POST">
    <h3>Transfer Money</h3>
    <label>Amount:</label>
    <input type="number" name="amount">
    <label>Recipient:</label>
    <input type="text" name="to_user">
    <button type="submit">Send</button>
</form>
