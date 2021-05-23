USE [HRSchema]
GO

/****** Object:  StoredProcedure [dbo].[SP_CHECK_FOR_EMPLOYEE_EXISTANCE]    Script Date: 7/17/2018 10:50:30 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[SP_CHECK_FOR_EMPLOYEE_EXISTANCE]
	-- Add the parameters for the stored procedure here
	@employeeID nvarchar(100)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT employeeID
	FROM	Employee
	WHERE employeeID = @employeeID
END

GO

