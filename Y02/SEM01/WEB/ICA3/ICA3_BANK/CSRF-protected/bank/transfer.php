<?php
session_start();
require "db.php"; // Removed security.php to keep it simple

if (!isset($_SESSION['user'])) { header("Location: login.php"); exit; }
$user = $_SESSION['user'];

// 1. GENERATE CSRF TOKEN
if (empty($_SESSION['csrf_token'])) {
    $_SESSION['csrf_token'] = bin2hex(random_bytes(32));
}

// Get balance for display
$stmt = $pdo->prepare("SELECT balance FROM accounts WHERE username = ?");
$stmt->execute([$user]);
$balance = $stmt->fetchColumn();
?>
<!DOCTYPE html>
<html>
<head><title>Transfer Funds (Secure)</title></head>
<body>

<h2>Welcome, <?php echo htmlspecialchars($user); ?></h2>
<p>Your balance: <strong>$<?php echo number_format($balance, 2); ?></strong></p>

<h3>Secure Transfer Form</h3>
<form action="update_balance.php" method="POST">

    <input type="hidden" name="csrf_token" value="<?php echo $_SESSION['csrf_token']; ?>">

    <label>Amount:</label><br>
    <input type="number" name="amount" required min="1"><br><br>

    <label>Recipient:</label><br>
    <input type="text" name="to_user" required><br><br>

    <button type="submit">Send</button>
</form>

</body>
</html>