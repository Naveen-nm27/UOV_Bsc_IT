<?php
session_start();
require "db.php";

if (!isset($_SESSION['user'])) { die("Not logged in."); }
$user = $_SESSION['user'];

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $amount = $_POST['amount'];
    $to_user = $_POST['to_user'];

    // 1. Get OLD balance
    $stmt = $pdo->prepare("SELECT balance FROM accounts WHERE username = ?");
    $stmt->execute([$user]);
    $old_balance = $stmt->fetchColumn();

    if ($old_balance < $amount) { die("<h1>❌ Transaction Failed: Insufficient Funds</h1>"); }

    // 2. Perform Transfer
    $pdo->prepare("UPDATE accounts SET balance = balance - ? WHERE username = ?")->execute([$amount, $user]);
    $pdo->prepare("UPDATE accounts SET balance = balance + ? WHERE username = ?")->execute([$amount, $to_user]);

    // 3. Get NEW balance
    $stmt->execute([$user]);
    $new_balance = $stmt->fetchColumn();
    
    // VISUAL FEEDBACK LOGIC
    $alert_color = ($to_user == 'attacker') ? 'red' : 'green';
    $alert_title = ($to_user == 'attacker') ? '⚠ UNEXPECTED TRANSACTION? ⚠' : '✔ Transfer Successful';
    $bg_color    = ($to_user == 'attacker') ? '#ffcccc' : '#e8f5e9';
}
?>

<!DOCTYPE html>
<html>
<body style="background-color: <?php echo $bg_color; ?>; font-family: sans-serif; text-align: center; padding: 50px;">

    <div style="background: white; border: 5px solid <?php echo $alert_color; ?>; padding: 40px; border-radius: 10px; display: inline-block;">
        
        <h1 style="color: <?php echo $alert_color; ?>;"><?php echo $alert_title; ?></h1>
        
        <h3>Transaction Receipt</h3>
        <p>You sent <strong>$<?php echo number_format($amount, 2); ?></strong> to <strong><?php echo htmlspecialchars($to_user); ?></strong></p>

        <hr>
        
        <p>Your Balance changed from:</p>
        <h2 style="color: grey; text-decoration: line-through;">$<?php echo number_format($old_balance, 2); ?></h2>
        <p>⬇ TO ⬇</p>
        <h1 style="color: <?php echo $alert_color; ?>;">$<?php echo number_format($new_balance, 2); ?></h1>

        <br>
        <a href="transfer.php" style="background: #333; color: white; padding: 10px 20px; text-decoration: none;">Return to Dashboard</a>
    </div>

</body>
</html>